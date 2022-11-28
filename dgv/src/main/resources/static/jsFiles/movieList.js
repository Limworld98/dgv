$(document).ready(function(){
    console.log(`js file loaded`);



    //import header, footer, navbar
    $(`#header`).load(`../layouts/header.html`);
    $(`#footer`).load(`../layouts/footer.html`);
    $(`#navbar`).load(`../layouts/navbar.html`);

    var movie;
    //forEach로 영화정보 출력
    for (var i=1; i<=movieList.length; i++){
        movie = movieList[i-1];
        // if (i%3===1){
        //     $(`table`).append(`<tr>`);
        // }
        $(`table`).append(`
            
            
            <div class="card" style="width: 18rem; display: inline-block; margin: 10px;">
  
  <div class="card-body">
    <h2 class="card-title text-center">${movie.movieName}</h2> <br>
    <p class="card-text text-end">감독</p>
    <h4 class="card-text text-end">${movie.director}</h4>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item text-end">${movie.genre}</strong></li>
     <li class="list-group-item text-end">${movie.agelimit}세</strong></li>
     <li class="list-group-item text-end">
    
     <form action="movieTimes" method="post">
     <button type="submit" class="btn btn-info" movieName="${movie.movieName}">예매하기</button>
    </form>
     
 
     </strong></li>
  </ul>
</div> 
            
          
        `)
        if (i/3===0){
            $(`table`).append(`<hr>`);
        }
    }


    // //버튼 리스너
    // $(`table`).on(`click`,`button`,function(){
    //     localStorage.setItem(`movieName`,$(this).attr(`movieName`));
    //
    //     location.href = 'movieTimes'
    // });

});