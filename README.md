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
