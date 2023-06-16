
# Appium_Basic_Calculator_Automation

### A basic calculator app is automated by testing its basic functionalites using Appium on an emulated device powered by Android Studio.

Here the following tasks are done:

* A basic Calculator app extracted from Calculator App is automated by extracting its apk.
* Basic operations like add,subtract,multiplication and divide functionality is checked whether it is giving correct result or not using Appium.

### Technology:
* Tool: Selenium Webdriver
* IDE: Intellij, Android Studio
* Build tool: Gradle
* Language: Java
* Test_Runner: Appium

### Prerequisites:
* Install Android Studio latest version
* Install Appium 1.17.1
* Install jdk 8 or any LTS version
* Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME
* Stable internet connection

### Project Run
#### Appium
* Turn on Developer Options on your android phone
* Connect your android phone with USB cable/ Create an emulated virtual device via Android Studio and run it.
* Open cmd and give adb devices command to get uuid.
* Open Appium and start server. Then open inspector tool.
* In the JSON Representation section, paste the following desired capabilities after adding your uuid and version:


```bash
  "deviceName": "My Device",
  "platformName": "Android",
  "uuid": Enter your uuid here,
  "platformVersion": Enter your android version,
  "appPackage": "com.google.android.calculator",
  "appActivity": "com.android.calculator2.Calculator"
```

#### Run the Automation Script by the following command:
```bash
  gradle clean test
```
