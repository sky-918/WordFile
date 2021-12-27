- 为什么不允许 Widget 中定义的属性变化呢？这是因为，**Flutter 中如果属性发生则会重新构建Widget树，即重新创建新的 Widget 实例来替换旧的 Widget 实例**，所以允许 Widget 的属性变化是没有意义的，因为一旦 Widget 自己的属性变了自己就会被替换。这也是为什么 Widget 中定义的属性必须是 final 的原因。

- | Widget                        | 说明             | 用途                                                         |
  | ----------------------------- | ---------------- | ------------------------------------------------------------ |
  | LeafRenderObjectWidget        | 非容器类组件基类 | Widget树的叶子节点，用于没有子节点的widget，通常基础组件都属于这一类，如Image。 |
  | SingleChildRenderObjectWidget | 单子组件基类     | 包含一个子Widget，如：ConstrainedBox、DecoratedBox等         |
  | MultiChildRenderObjectWidget  | 多子组件基类     | 包含多个子Widget，一般都有一个children参数，接受一个Widget数组。如Row、Column、Stack等 |

  Flutter中有两种布局：

  - 基于RenderBox的盒布局
  - 基于Sliver按需加载的列表布局

- 尺寸限制类容器（constrints）：ConstrainedBox、SizeBox、UnconstrainedBox、AspectRatio等。注意：**任何时候字组件都要先遵循父组件的约束**，多重限制：**有多个父布局时遵循同类型（都是minHeight或都是minWidth）宽和高取父布局中相对大的**

  ```dart
  //多重限制
  ConstrainedBox(
    constraints: BoxConstraints(minWidth: 90.0, minHeight: 20.0),
    child: ConstrainedBox(
      constraints: BoxConstraints(minWidth: 60.0, minHeight: 60.0),
      child: redBox,
    )
  )
  ```

- 线性布局（Row和Column）和弹性布局（Flex）,Row和Column都是继承的Flex，Flex和Expanded连用。

- 流式布局(Wrap和Flow)

  ```dart
   Wrap(
     spacing: 8.0, // 主轴(水平)方向间距
     runSpacing: 4.0, // 纵轴（垂直）方向间距
     alignment: WrapAlignment.center, //沿主轴方向居中
     children: <Widget>[
       Chip(
         avatar: CircleAvatar(backgroundColor: Colors.blue, child: Text('A')),
         label: Text('Hamilton'),
       ),
       Chip(
         avatar: CircleAvatar(backgroundColor: Colors.blue, child: Text('M')),
         label: Text('Lafayette'),
       ),
       Chip(
         avatar: CircleAvatar(backgroundColor: Colors.blue, child: Text('H')),
         label: Text('Mulligan'),
       ),
       Chip(
         avatar: CircleAvatar(backgroundColor: Colors.blue, child: Text('J')),
         label: Text('Laurens'),
       ),
     ],
  )
  ```

  **`Flow`主要用于一些需要自定义布局策略或性能要求较高(如动画中)的场景。**

- **层叠布局Stack和Positioned**，fit：此参数用于确定**没有定位**的子组件如何去适应`Stack`的大小，`StackFit.loose`表示使用子组件的大小，`StackFit.expand`表示扩伸到`Stack`的大小。

- 





