const Class1 = require("../lib/class1");

describe('Tests for Class1', () => {
    
    test("Failing test", () => {
        underTest = new Class1();
        
        expect(underTest.exampleFunction()).toBe(true)
    })

    test("Passing test", () => {
        expect(true).toBe(true)
    })

});