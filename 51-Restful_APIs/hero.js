$(document).ready(function () {

    $("#randomButton").on("click", function (event) {
        $.ajax({
            url: "http://api.icndb.com/jokes/random?exclude=explicit",
            type: "GET",
            dataType: "json"
        }).done((data) => {
            $("#message").html(data.value.joke);
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });

    $("#nerdButton").on("click", function (event) {
        $.ajax({
            url: "http://api.icndb.com/jokes/random?exclude=explicit&limitTo=nerdy",
            type: "GET",
            dataType: "jsßon"
        }).done(function (data) {
            $("#message").html(data.value.joke);
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });

});


