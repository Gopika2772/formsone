const data = document.getElementById("data")
console.log("data script is working");
let arr = [];
axios.get("http://65.1.134.25:8080/get-forms")
    .then((res) => {
        console.log(arr);
        arr = res.data;
        showdata();
    })

function showdata() {
    console.log(arr);
    arr.forEach((val, index) => {
        console.log(index);
        data.innerHTML += `
        <div style="border: 2px solid black">
        <h1><span>${index + 1}. Name :  ${val.name}</span></h1>

        <h1>&nbsp;Email: ${val.email}</h1>
    </div>
        `;
    })
}