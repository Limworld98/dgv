$(document).ready(function(){
    console.log(`js file loaded`);

    //import header, footer, navbar
    $(`#header`).load(`../layouts/header.html`);
    $(`#footer`).load(`../layouts/footer.html`);
    $(`#navbar`).load(`../layouts/navbar.html`);

    const movieName = localStorage.getItem(`movieName`);

    $(`#pageTitle`).text(`${movieName} 좌석 선택`)
    
    $(`td`).click(function(){

        //선택된 좌석 이름 
        const seatName = $(this).text();

        if ($(this).attr(`class`)===`bg-white`){
            $(this).attr(`class`,`bg-info`);
            $(`#selected-seats`).prepend(`<div class="card" id="${seatName}-selected">
            <div class="card-body">
              <div class="row">
                <div class="col-3">${seatName}</div>
                <div class="col-5">
                
                <div class="form-check">
                        <input class="form-check-input" type="radio" name="${seatName}" value="성인" checked>
                        <label class="form-check-label" for="flexRadioDefault1">
                          성인
                        </label>
                      </div>
                      <div class="form-check">
                        <input class="form-check-input" type="radio" name="${seatName}" value="청소년">
                        <label class="form-check-label" for="flexRadioDefault2">
                          청소년
                        </label>
                      </div>
                
                </div>
                <div class="col-4" id="${seatName}-price">10000</div>
              </div>
            </div>
          </div>`)

          let currentPrice = Number($(`#total-price`).text());
          currentPrice = currentPrice+10000;
          $(`#total-price`).text(String(currentPrice));
        }
        else if ($(this).attr(`class`)===`bg-info`){
            $(this).attr(`class`,`bg-white`);
            let removePrice = Number($(`#${seatName}-price`).text());
            $(`#${seatName}-selected`).remove();

            let currentPrice = Number($(`#total-price`).text());
            currentPrice = currentPrice-removePrice;
            $(`#total-price`).text(String(currentPrice));
        }
        else {
            alert(`예매할 수 없는 좌석입니다.`);
        }
        
    })

  //append 된 요소에 대해 이벤트처리하기 위함 
  $(`#selected-seats`).on(`change`,`input.form-check-input`,function(){
    console.log(`clicked`);
    const seatName = $(this).attr(`name`);
    let totalPrice = Number($(`#total-price`).text());
    if ($(this).attr(`value`)===`성인`){
      //alert(seatName+`성인`);
      $(`div #${seatName}-price`).text(`10000`);
      $(`#total-price`).text(String(totalPrice+2000));
    } else {
      $(`div #${seatName}-price`).text(`8000`);
      $(`#total-price`).text(String(totalPrice-2000));
    }
    
  })

  $(`button`).click(function(){
    localStorage.setItem(`totalPrice`,$(`#total-price`).text());
    location.href = `payment`;
  });
  


});

