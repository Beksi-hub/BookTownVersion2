/*
document.querySelector('#booktown_search').oninput = function (){
    let val = this.value.trim();
    let bookItems = document.querySelectorAll('.course-card');
    let bookTitle = document.querySelectorAll('.card-title');

    if (val != ''){

        bookItems.forEach(function (book){
           if (book.innerText.search(val) == -1){
               book.classList.add('hide');
           }else {
               book.classList.remove('hide');
           }

        });
    }else {
        bookItems.forEach(function (book) {
            book.classList.remove('hide');
        });
    }
}*/
