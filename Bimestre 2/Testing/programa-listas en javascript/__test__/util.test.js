const { test } = require('@jest/globals');
const { generateText } = require('../util.js');

test("Saída de nome e idade", () => {
    const text =generateText('Caio Castro',22);
    expect(text).toBe('Caio Castro (22 years old)');
});