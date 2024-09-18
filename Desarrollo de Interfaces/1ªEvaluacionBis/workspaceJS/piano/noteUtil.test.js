import getNoteFromKey from "./noteUtil"
import {expect, test} from 'vitest'

test('si le paso la letra a devovlerá C4',  ()=> {
    let note = getNoteFromKey('a')
    expect(note).toBe('C4')
})

test('si le paso la letra A ',  ()=> {
    let note = getNoteFromKey('A')
    expect(note).toBe('C4')
})

test('si le paso letra devovlerá undifined ',  ()=> {
    let note = getNoteFromKey(undefined)
    expect(note).toBeUndefined()
})