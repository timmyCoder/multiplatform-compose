package com.rouge41.kmm.compose.test

import com.rouge41.kmm.compose.*
import com.rouge41.kmm.compose.test.demos.*

data class Resources(val logo: ImageResource)

@Composable
fun Content(resources: Resources) {
    Theme {
        var state = remember { mutableStateOf(true) }
        if (state.value) {
            App(state, resources)
        } else {
            Raw(state, resources)
        }
    }
}

enum class Demo {
    HelloPlatform,
    Lorem,
    Counter,
    BackPress,
    Layout,
    TextStyles,
    Images,
    // Below are dropped in navigation demos
    BottomNavigation,
    Navigation,
    App,
    Raw,
}