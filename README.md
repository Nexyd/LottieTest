# Docs
## URLs
```
https://github.com/airbnb/lottie-android
http://airbnb.io/lottie/#/android
```

## Install

Add dependency in Gradle build file:
```gradle
implementation 'com.airbnb.android:lottie:3.1.0'
```

## Layout XML

``` xml
<com.airbnb.lottie.LottieAnimationView
    android:id="@+id/originalTextView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:lottie_rawRes="@raw/name"
/>
```

## Properties

Establece el punto de inicio de la animacion, valor de 0 a 1
```
app:lottie_progress="<double>"
app:lottie_repeatCount="<int>"
app:lottie_repeatMode="repeat|reverse"
app:lottie_speed="<int>"
app:lottie_scale="<double>"
app:lottie_fileName="<path>"
app:lottie_loop="true|false"
app:lottie_autoPlay="true|false"
app:lottie_url="<url>"
```

Set animation starting progress, ranging from 0 to 1
``` xml
app:lottie_progress="0.5"
```

Set number of times the animation will repeat
(initial + repeatCount)
``` xml
app:lottie_repeatCount="3"
```

Set animation repeat mode:
    - 'repeat'  starts on the 1st animation frame
    - 'reverse' starts on the last animation frame
    
``` xml
app:lottie_repeatMode="reverse"
```

Set animation play speed
``` xml
app:lottie_speed="2"
```

Set animation scale
``` xml
app:lottie_scale="1.5"
```

Load a json animation file from path
``` xml
app:lottie_fileName="name.json"
```

Load a json animation file from a url
``` xml
app:lottie_url="https://raw.githubusercontent.com/airbnb/lottie-android/master/LottieSample/src/main/res/raw/name.json"
```

Set animation repeat to loop
``` xml
app:lottie_loop="true"
```

Start animation automatically
``` xml
app:lottie_autoPlay="true"
```