document.addEventListener('DOMContentLoaded', () => {
    const btnSearch = document.getElementById('btnSearch');

    btnSearch.addEventListener('click', (event) => {
        const movieData = document.getElementById('movieData');
        const movieName = document.getElementById('movie').value;

        fetch("http://www.omdbapi.com/?apikey=[get_your_own!]&s=" + movieName)
        .then((response) => {
            return response.json();
        })
        .then((data) => {
            movieData.innerText = '';
            console.log(data);
            for (let i = 0; i < data.Search.length; i++) {
                const newRow = buildRow(data.Search[i]);
                movieData.appendChild(newRow);
            }
        })
        .catch(() => {
            console.log("WE GOT REJECTED");
        });
        
        /*
        $.ajax({
            url: "http://www.omdbapi.com/?apikey=[get_your_own!]&s=" + movieName,
            type: "GET",
            dataType: "json"
        })
        .done((data) => {
            movieData.innerText = '';
            data.Search.forEach((movie) => {
                const newRow = buildRow(movie);
                movieData.appendChild(newRow);
            });
        })
        .fail(() => {
            console.log("FAILURE");
        });
        */
    });
});

function buildRow(data) {
    const tr = document.createElement('tr');
    const posterCell = document.createElement('td');
    const imdbCell = document.createElement('td');
    const nameCell = document.createElement('td');
    const yearCell = document.createElement('td');
    const img = document.createElement('img');

    imdbCell.innerText = data.imdbID;
    nameCell.innerText = data.Title;
    yearCell.innerText = data.Year;

    img.src = data.Poster;
    img.setAttribute('class','img-responsive');
    img.setAttribute('class','img-thumbnail');

    posterCell.setAttribute('class','col-sm-2');
    posterCell.append(img);

    tr.append(posterCell);
    tr.append(imdbCell);
    tr.append(nameCell);
    tr.append(yearCell);

    return tr; 
};
