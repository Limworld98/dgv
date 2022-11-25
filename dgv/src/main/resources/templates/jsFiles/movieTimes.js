$(document).ready(function(){
    console.log(`js file loaded`);

    //import header, footer, navbar
    $(`#header`).load(`../templates/layouts/header.html`);
    $(`#footer`).load(`../templates/layouts/footer.html`);
    $(`#navbar`).load(`../templates/layouts/navbar.html`);

    const movieName = localStorage.getItem(`movieName`);
    console.log(movieName);
    console.log($(`#movieName`).innerText);
    
    $(`#movieName`).text(`DGV ${movieName} 시간표`);

    $(`button`).click(function(){
        
        localStorage.setItem(`movieName`,movieName);
        location.href = `seats.html`;
    });



});