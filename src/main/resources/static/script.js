console.log("working1");
const form = document.getElementById("form");
const name = document.getElementById("name");
const email = document.getElementById("email");

form.addEventListener('submit', (e) => {
    e.preventDefault();
    //validations
    if (name.value != "" && email.value != "") {
        postData();
    }
})

async function postData() {
    const data = {
        name: name.value,
        email: email.value,
    }
    axios.post("http://65.1.134.25:8080/post-forms", data)
        .then((res) => {
            // console.log("Working")
            window.location.href = "/data";
        })
        .catch((err) => console.log(err));
}