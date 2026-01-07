function admintoggle() {
    const admincheck = document.getElementById("admin");
    const customercheck = document.getElementById("customer");

    admincheck.style.backgroundColor = "#5CC3FF";
    customercheck.style.backgroundColor = "white";
}

function custtoggle() {
    const admincheck = document.getElementById("admin");
    const customercheck = document.getElementById("customer");

    admincheck.style.backgroundColor = "white";
    customercheck.style.backgroundColor = "#5CC3FF";
}

function togglepass()
{
    const pass = document.getElementById("pass");
    if (pass.type === "password")
    {
        pass.type = "text";
    } else {
        pass.type = "password";
    }
}
function togglepass2()
{
    const pass = document.getElementById("pass2");
    if (pass.type === "password")
    {
        pass.type = "text";
    } else {
        pass.type = "password";
    }
}