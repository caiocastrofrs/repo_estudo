// get all keys
const keys = document.querySelectorAll(".key");

//plays notes 
function playNote(event) {
    // keyCode
    let audioKeyCode = getKeyCode(event);
    //typed or pressed key
    const key = document.querySelector(`.key[data-key="${audioKeyCode}"]`);

    const cantFoundAnyKey = !key;
    // check if key exists
    if(cantFoundAnyKey) {
        return;
    }

    playAudio(audioKeyCode);
    AddPlayingClass(key);
}

function AddPlayingClass(key) {
    key.classList.add('playing');
}

function removePlayingClass(event) {
    event.target.classList.remove("playing");
}


function getKeyCode(event) {

    let keyCode;

    const isKeyboard = event.type === "keydown";

    if(isKeyboard) { 
        keyCode = event.keyCode;
    } else {
        keyCode = event.target.dataset.key;
    }
    console.log(event.type);
    return keyCode;
}

function playAudio(audioKeyCode) {

    const audio = document.querySelector(`audio[data-key="${audioKeyCode}"]`);
    audio.currentTime = 0;
    audio.play();
}
//click with mouse 
keys.forEach(function(key) {
    key.addEventListener("click", playNote);
    key.addEventListener("transitionend", removePlayingClass);
})
//keyboard type
window.addEventListener("keydown", playNote);