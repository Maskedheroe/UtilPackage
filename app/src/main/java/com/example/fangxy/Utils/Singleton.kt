package com.example.fangxy.Utils

class Singleton private constructor(){

    public var value:Singleton ? = null

    private object mHolder{val INSTANCE = Singleton()}

    companion object Factory{
        fun getInstance():Singleton{
            return mHolder.INSTANCE
        }
    }

}