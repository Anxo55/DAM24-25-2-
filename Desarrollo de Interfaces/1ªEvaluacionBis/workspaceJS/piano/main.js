import './style.css'
// Para usar toner tenemos que importarlo.
import * as Tone from "tone";

const synth = new Tone.Synth().toDestination();

// en vez de int como en java usamos el let.
// Este es un array con todas las teclas.
// Habia que aplicar el ALL sino, no pilla todos los key, al poner el ALL coger todo..
let keys = document.querySelectorAll('.key')

for(let key of keys) {
    let noteToPlay = key.getAttribute('data-note')
    key.addEventListener('click', () => playNote(noteToPlay))
    // mousedown , para que siga sonando la tecla.

}


function playNote(note) {    
    synth.triggerAttackRelease(note, "8n");
}