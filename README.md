[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-AndroidMask-green.svg?style=flat)](https://android-arsenal.com/details/1/2089)
[![MIT license](https://img.shields.io/dub/l/vibe-d.svg)](http://opensource.org/licenses/MIT)

# AndroidMask

Add mask on your EditText's

# How To

### Android Studio

```
dependencies {
  compile 'br.com.jansenfelipe:androidmask:1.0.0'
}
```
### Eclipse ADT

Download .jar ant put in `libs/`

https://github.com/jansenfelipe/androidmask/tree/master/app/dist

##### Find EdiText's

```java
public class TesteMaskActivity extends Activity {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.main);

   EditText cpf = (EditText) findViewById(R.id.txtCPF);
   EditText tel = (EditText) findViewById(R.id.txtTelefone);
}
```
##### Create `MaskEditTextChangedListener`

```java
MaskEditTextChangedListener maskCPF = new MaskEditTextChangedListener("###.###.###-##", cpf);
MaskEditTextChangedListener maskTEL = new MaskEditTextChangedListener("(##)####-####", tel);
```

##### Add `addTextChangedListener`

```java
cpf.addTextChangedListener(maskCPF);
tel.addTextChangedListener(maskTEL);
```
# License

The MIT License (MIT)

Copyright (c) 2015 Jansen Felipe

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
