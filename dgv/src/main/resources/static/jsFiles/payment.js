$(document).ready(function(){
    console.log(`js file loaded`);

    //import header, footer, navbar
    $(`#header`).load(`../layouts/header.html`);
    $(`#footer`).load(`../layouts/footer.html`);
    $(`#navbar`).load(`../layouts/navbar.html`);

    let totalPrice = localStorage.getItem(`totalPrice`);
    

    $(`#total-price`).text(`총액 : ${totalPrice}`);

    $(`input.form-check-input`).change(function(){
        if($(this).attr(`value`)===`신용카드`){
            $(`#payment-specific`).empty();
            $(`#payment-specific`).append(
                `<select class="form-select" aria-label="Default select example">
                <option selected>카드사 선택</option>
                <option value="1">신한은행</option>
                <option value="2">IBK기업은행</option>
                <option value="3">국민은행</option>
            </select>

            <br>

            <input type="text" class="form-control" placeholder="카드번호" aria-label="Username" aria-describedby="basic-addon1">

            <br>`    
            )

        }
        else {
            $(`#payment-specific`).empty();
            $(`#payment-specific`).append(
                `
                <div class="card">
                        <div class="card-body">
                            <h3>신한은행 <hr> DGV컴퍼니 <hr> 123-456-789987</h3> 
                        </div>
                      </div><br>
                      <input type="text" class="form-control" placeholder="예금주" aria-label="Username" aria-describedby="basic-addon1"><br>

                     위 계좌로 <i>10분 이내에</i> 입금해주시기 바랍니다
                `
            )

        }

    });

    $(`#done`).click(function(){
        alert(`결제 완료! 이용해주셔서 감사합니다`);
        document.location.href=`main`;
    })


});