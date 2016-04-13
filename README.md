# DataBinding
Hi friends  here i have created one demo for explain data binding.
In this demo code are so simple and easy  to understand initially  databinding topic.
In this demo we have included Databinding with normal data or screen also included databinding with RecyclerView,
And another thing we have included how to bind imageview with mechanisam of using data binding 


## Gradel Configuration for Do databinding 

First you have require to install databinding plugin in your Android Studio

After install plugin  you have Require to done some changes in both gradel file app level or project level.
### 1. Project level gradel changes :

  - Require to add class path in dependency  block
  
  dependencies {
        classpath 'com.android.tools.build:gradle:2.0.0'
        classpath "com.android.databinding:dataBinder:1.+"
        //we have require to add class path for data bindig like above
    }
  

### 1. App level gradel changes :

  -Require to Apply DataBinding Pluging in App level gradel.like following
  
      apply plugin: 'com.android.databinding'

  - Add dependency  of Databinding library 
  
      compile 'com.android.databinding:baseLibrary:1.0-rc5'

Now after you will able  to do databinding in your project, Best of luck.
  
