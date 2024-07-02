Coding Procedure of Data Binding

1. new project > Basic View Activity

2. build.gradle - app

dataBinding {
	enabled = true
}

or, 
dataBinding.enabled = true

3. data class

data class DataClass1(
    var textData: String
)

https://github.com/mkjry/DataBinding_Simplified/commit/030b9d4a5091df861f8a137f89eb4a258bceb375

4. add/update data to data class - MainActivity

binding.dataItem = DataClass1("Hello World")
	
https://github.com/mkjry/DataBinding_Simplified/commit/6ad439d3eb74be735270ffa3fcc5939d25d1d4f9#diff-398673cbb1d8b143f83963180f6ab777380d7b204a07c28b70fe03844aa92c78

5. convert layout to databinding format - layout.xml
https://github.com/mkjry/DataBinding_Simplified/commit/6ad439d3eb74be735270ffa3fcc5939d25d1d4f9#diff-890c768d5041bf31eb05673f33ad9d0ff7a42a754da46062eec65969d735c7dd

6. data binding on xml

https://github.com/mkjry/DataBinding_Simplified/commit/6ad439d3eb74be735270ffa3fcc5939d25d1d4f9

7. connect observe to xml layout from Activity

   class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)

     binding.dataItem = DataClass1("Hello World")
     // 'dataItem' is name on layout xml file

   activity_main.xml
//     <data>
//        <variable
//            name="dataItem"
//            type="com.ssj.databinding_simplified.DataClass1" />
//    </data>

*code update history list
https://github.com/mkjry/DataBinding_Simplified/commits/main/

![image](https://github.com/mkjry/DataBinding_Simplified/assets/132794460/8377c313-a520-4182-876e-a9a4caa3dddc)

