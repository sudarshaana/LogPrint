I'm testing to build a android library that can be used via jitpack.

_Want to Use? :P_

**Step 1. Add the JitPack repository to your build file**

Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
  
  **Step 2. Add the dependency**
  
 ```
 dependencies {
	        implementation 'com.github.sudarshaana:LogPrint:1.1'
	}
  ```
  
The library will use __**LogPrint**__ as the output message.

**How to use?**

Simply add the line to user code
```
SLog.d("Hi from Library");
```

*Output*
```
LogPrint: Hi from Library
```
