function search_result() {
    var x = document.forms["searchForm"]["search-result"].value;
    if (x == "Spring" || x == "spring") {
        var y = document.getElementById("search-result");
        y.style.display = "block";
    }
    return false;
}

function validateLogIn() {
    var x = document.forms["logInForm"]["account-type"].value;
    if (x == "Trainer") {
        window.location.href = "mentor.html";
        return false;
    } else if (x == "Trainee") {
        window.location.href = "user.html";
        return false;
    } else if (x == "Admin") {
        window.location.href = "admin.html";
        return false;
    }
    return false;
}

function training_result() {
    var x = document.forms["trainingForm"]["trainingTechnology"].value;
    if (x == "spring") {
        var y = document.getElementById("training-result");
        y.style.display = "block";
    }
    return false;
}

function addskill(res) {
    var id = "#" + res;
    $(id).appendTo('#mentor-skills');
    document.getElementById(res).disabled = true;
    return false;
}