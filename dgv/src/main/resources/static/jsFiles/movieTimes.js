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

    var movieScreeningTime;

    movieTimes.forEach(function(movie){
        if (movie.movieName===movieName){
            console.log("선택한 영화 : "+movieName);
            movieScreeningTime = movie.movieScreeningTime;
        }
    })

    console.log(movieScreeningTime);
    console.log(movieScreeningTime[0]);

    for (var i=0;i<5;i++){
        if (movieScreeningTime[i]==='1'){
            $(`#${i}`).append(`
                <td>잔여좌석 : 20석</td>
                <td><button type="button" class="btn btn-info" movieName="#">예매하기</button></td>
            `)
        } else {
            $(`#${i}`).append(`
                <td></td>
                <td></td>
            `).attr(`class`,`bg-secondary`);
        }
    }





    $(`button`).click(function(){
        
        localStorage.setItem(`movieName`,movieName);
        location.href = `seats`;
    });



});