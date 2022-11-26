$(document).ready(function(){
    console.log(`js file loaded`);

    //import header, footer, navbar
    $(`#header`).load(`../layouts/header.html`);
    $(`#footer`).load(`../layouts/footer.html`);
    $(`#navbar`).load(`../layouts/navbar.html`);

    const movieName = localStorage.getItem(`movieName`);
    console.log(movieName);
    console.log($(`#movieName`).innerText);
    
    $(`#movieName`).text(`DGV ${movieName} 시간표`);

    $(`button`).click(function(){
        
        localStorage.setItem(`movieName`,movieName);
        location.href = `seats.html`;
    });



});