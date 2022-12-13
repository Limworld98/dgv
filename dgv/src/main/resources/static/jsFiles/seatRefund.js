$(document).ready(function(){

    //import header, footer, navbar
    $(`#header`).load(`../layouts/header.html`);
    $(`#footer`).load(`../layouts/footer.html`);
    $(`#navbar`).load(`../layouts/navbar.html`);




    const seatName = localStorage.getItem("seatName");
    const age = localStorage.getItem("age");
    const movieName = localStorage.getItem("movieName");


    console.log(seatName);
    console.log(age);


    $(`#movieName`).text(movieName);
    $(`#seatName`).text(seatName);
    $(`#age`).text(age);

    $(`button`).click(function (){
        alert(`환불이 완료되었습니다`);
        location.href = `main`
    })

})