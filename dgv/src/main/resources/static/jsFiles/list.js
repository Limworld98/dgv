$(document).ready(function(){
    console.log(`js file loaded`);

    //import header, footer, navbar
    $(`#header`).load(`../layouts/header.html`);
    $(`#footer`).load(`../layouts/footer.html`);
    $(`#navbar`).load(`../layouts/navbar.html`);

    $(`.button1`).click(function(){

        location.href = 'payback.html';

    });
    $(`.button2`).click(function(){

        localStorage.setItem(`movieName`,$(this).attr(`movieName`));
        location.href = 'seats.html';

        });


});