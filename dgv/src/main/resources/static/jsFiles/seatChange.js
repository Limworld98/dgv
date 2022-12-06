$(document).ready(function(){

    //import header, footer, navbar
    $(`#header`).load(`../layouts/header.html`);
    $(`#footer`).load(`../layouts/footer.html`);
    $(`#navbar`).load(`../layouts/navbar.html`);

    //var selected = true;

    $(`td`).click(function(){
        var status = $(this).attr(`class`);
        var seat = $(this).text();

        if (status===`bg-secondary`){
            alert(`선택할 수 없는 좌석입니다`);
        }
        else if (status===`bg-white`){

            //선택된 칸 하늘색으로, 하늘색인 칸 흰색으로
            $(`td[class="bg-info"]`).attr(`class`,`bg-white`);
            $(this).attr(`class`,`bg-info`);


            $(`#selected`).text(seat);
        }




    })

    $(`button`).click(function(){
      alert(`좌석 변경 완료`);
      location.href = `main`
    })


})