import getNoteFromKey from './noteUtil';
import './style.css'
// Para usar toner tenemos que importarlo.
import * as Tone from "tone";

console.log('Hola chicos y chicas')

// const synth = new Tone.Synth().toDestination();
const synth = new Tone.Sampler({
    urls: {
        C4: "C4.mp3",
        "D#4": "Ds4.mp3",
        "F#4": "Fs4.mp3",
        A4: "A4.mp3",
                
    },
    release: 1,
    baseUrl: "",
}).toDestination();

// en vez de int como en java usamos el let.
// Este es un array con todas las teclas.
// Habia que aplicar el ALL sino, no pilla todos los key, al poner el ALL coger todo..
let keys = document.querySelectorAll('.key')

for (let key of keys) {
    let noteToPlay = key.getAttribute('data-note')
    key.addEventListener('mousedown', () => playNote(noteToPlay)) //mousedown se cambió por el click
    key.addEventListener('mouseup', () => stopNote())
    key.addEventListener('mouseleave', () => stopNote())
}

document.addEventListener('keypress', ctrlTeclado)
document.addEventListener('keyrelease', stopNote)

function ctrlTeclado(event) {
    let keyName = event.key
    let note = getNoteFromKey(keyName)
    let key = document.querySelector('[data-note='+note+']')
    key && key.classList.add('pressed')
    playNote(note)
}


function playNote(note) {
    synth.triggerAttackRelease(note);
}

function stopNote(event) {
    let keyName = event.key
    let note = getNoteFromKey(keyName)
    let key = document.querySelector('[data-note='+note+']')
    key && key.classList.remove('pressed')
    
    synth.triggerRelease();
}