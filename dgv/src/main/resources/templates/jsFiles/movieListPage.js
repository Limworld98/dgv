$(document).ready(function(){
    console.log(`js file loaded`);

    //import header, footer, navbar
    $(`#header`).load(`../templates/layouts/header.html`);
    $(`#footer`).load(`../templates/layouts/footer.html`);
    $(`#navbar`).load(`../templates/layouts/navbar.html`);

    $(`button`).click(function(){
        
        localStorage.setItem(`movieName`,$(this).attr(`movieName`));

        location.href = 'movieTimes.html'


    });
});