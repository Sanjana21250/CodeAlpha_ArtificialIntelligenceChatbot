async function sendMessage() {

    let input =
        document.getElementById("user-input");

    let message = input.value;

    let chatBox =
        document.getElementById("chat-box");

    chatBox.innerHTML +=
        "<p><b>You:</b> " + message + "</p>";

    let response =
        await fetch(
            "http://localhost:8080/chat?message="
            + message
        );

    let botReply = await response.text();

    chatBox.innerHTML +=
        "<p><b>Bot:</b> " + botReply + "</p>";

    input.value = "";
}