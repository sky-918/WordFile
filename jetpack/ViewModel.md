#### ViewModel

| **UI controller**                                            | **ViewModel**                                                |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| An example of a UI controller is the `ScoreFragment` that you created in this codelab. | An example of a `ViewModel` is the `ScoreViewModel` that you created in this codelab. |
| Doesn't contain any data to be displayed in the UI.          | Contains data that the UI controller displays in the UI.     |
| Contains code for **displaying data**, and user-event code such as click listeners. | **Contains code for data processing.**(包含数据以及数据逻辑运算) |
| Destroyed and re-created during every configuration change.  | **Destroyed** only when the associated UI controller goes away permanently—for an activity, when **the activity finishes**, or for a fragment, when the **fragment is detached**.（Fragment 解除绑定） |
| Contains views.                                              | **Should never contain references to activities, fragments, or views**, because they don't survive configuration changes, but the `ViewModel` does.（不应该含有view的引用） |
| Contains a reference to the associated `ViewModel`.          | **Doesn't contain any reference to the associated UI controller.**（不会含有任何activity或者fragment的引用） |

* ViewModel保持数据，要比**onSaveInstanceState()**,更加方便实用

##### LiveData

* LiveData可以感知生命周期，配合ViewModel使用非常方便，LiveData封装在ViewModle中可以
* LiveData是用来包装数据的，可以包装任何数据，同时可以根据数据的变化改变UI。
* LiveData是被观察者，数据改变可以让观察者（activit、fragment）更新ui

##### To add LiveData

* Change the type of the data variables in ViewModel to LiveData or MutableLiveData.
* To change the value of the data held by the `LiveData`, use the `setValue()` method on the `LiveData` variable.

##### ViewModel and data binding

* 在布局中设置

  ```
  <data>
  
         <variable
             name="gameViewModel"
             type="com.example.android.guesstheword.screens.game.GameViewModel" />
     </data>
  ```



* 在代码中设置

  ```
  binding.gameViewModel = viewModel
  binding.lifecycleOwner = viewLifecycleOwner//绑定生命周期
  ```

##### data binding在布局中的使用

* 可以绑定数据，可以进行拼接

   android:text="@{@string/quote_format(gameViewModel.word)}"

* 也可以绑定监听方法

   android:onClick="@{() -> gameViewModel.onSkip()}"

  ##### ViewModel中Transformations.map数据的转换

```
val newResult = Transformations.map(someLiveData) { input ->
   // Do some transformation on the input live data
   // and return the new value
}
```

详细情况查看在kotlinAppDemo文件夹下的GuessTheWord这个app的源码