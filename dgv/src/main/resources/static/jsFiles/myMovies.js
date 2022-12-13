$(document).ready(function(){
    console.log(`js file loaded`);

    //import header, footer, navbar
    $(`#header`).load(`../layouts/header.html`);
    $(`#footer`).load(`../layouts/footer.html`);
    $(`#navbar`).load(`../layouts/navbar.html`);

    //좌석 변경 버튼
    $(`button[btnType="changeBtn"]`).click(function (){
        //seatName 좌석이름 age 성인,청소년정보
       localStorage.setItem(`seatName`,$(this).attr(`seatName`));
       localStorage.setItem(`age`,$(this).attr(`age`));

       //좌석변경 페이지로 이동
       location.href = `seatChange`
    });

    //환불 버튼
    $(`button[btnType="refundBtn"]`).click(function (){
        //seatName 좌석이름 age 성인,청소년정보
        localStorage.setItem(`seatName`,$(this).attr(`seatName`));
        localStorage.setItem(`age`,$(this).attr(`age`));
        localStorage.setItem(`movieName`,$(this).attr(`movieName`));

        location.href = `seatRefund`

        //
    });



});