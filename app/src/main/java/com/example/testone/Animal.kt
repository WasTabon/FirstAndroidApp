package com.example.testone

abstract class Animal(_name: String, _age: Int)
{
    public val name : String
    public val age : Int

    init
    {
        name = _name
        age = _age
    }
}