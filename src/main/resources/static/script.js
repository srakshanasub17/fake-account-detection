function analyzeAccount() {

    const data = {
        username: document.getElementById("username").value,
        followers: parseInt(document.getElementById("followers").value),
        following: parseInt(document.getElementById("following").value),
        posts: parseInt(document.getElementById("posts").value),
        accountAge: parseInt(document.getElementById("accountAge").value),
        profilePicture: document.getElementById("profilePicture").value,
        bio: document.getElementById("bio").value
    };

    fetch("/analyze", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
        .then(response => response.json())
        .then(result => {
            document.getElementById("result").innerHTML =
                "Result: " + result.result +
                "<br>Fake Score: " + result.fakeScore + "%";
        });

}