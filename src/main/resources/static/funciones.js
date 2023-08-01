// app.js
document.addEventListener("DOMContentLoaded", function () {
    var body = document.querySelector("body");
    body.style.backgroundImage = "url('https://images2.alphacoders.com/101/thumb-1920-1017005.jpg')"; // Ajusta la ruta de la imagen según la ubicación de tu archivo
    body.style.backgroundSize = "cover";
    // Agrega otros estilos relacionados con el fondo si los deseas
});


document.addEventListener("DOMContentLoaded", function () {
    const passwordField = document.getElementById("password");
    const togglePasswordButton = document.getElementById("togglePassword");
    let isPasswordVisible = false;

    togglePasswordButton.addEventListener("click", function () {
        isPasswordVisible = !isPasswordVisible;
        passwordField.type = isPasswordVisible ? "text" : "password";
        togglePasswordButton.textContent = isPasswordVisible ? "🙈" : "👁️";
    });
});