package com.example.importantdependencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 1) Add Dependency
         * def lifecycle_version = "2.5.0-alpha02"
         *     def arch_version = "2.1.0"
         *     def room_version = "2.4.1"
         *
         * // ViewModel
         *     implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
         *     // ViewModel utilities for Compose
         *     implementation "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version"
         *     // LiveData
         *     implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
         *
         *     // Annotation processor
         *     implementation "androidx.lifecycle:lifecycle-compiler:$lifecycle_version"
         *
         *     implementation "androidx.room:room-runtime:$room_version"
         *     annotationProcessor "androidx.room:room-compiler:$room_version"
         *
         * ////////////////////////////////////////////////////////////////////////////////////////
         * 		************************************************************
         * 			LATEST UPDATED DEPENDENCY FOR ROOM MVVM JAVA
         * 		*************************************************************
         *
         * def lifecycle_version = "2.6.0-alpha05"
         *     def room_version = "2.5.0"
         *
         * // ViewModel
         *     implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
         *     // ViewModel utilities for Compose
         *     implementation "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version"
         *     // LiveData
         *     implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
         *
         *     // Annotation processor
         *     implementation "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
         *
         *     implementation "androidx.room:room-runtime:$room_version"
         *     annotationProcessor "androidx.room:room-compiler:$room_version"
         *
         *
         * ///////////////////////////////////////////////////////////////////////////////////////
         *
         *
         *
         * 2)design MAIN UI xml
         *
         *
         * 3)Model Class (data class, table)
         *
         * 4)DAO Class
         *
         * 5)Database CLass
         *
         * 6)Repository
         *
         * 7)ViewModel
         *
         * 8)Factory
         *
         * 9) Mainactivity xml, wrap constraint layout with <layout> for data binding
         *
         * 10) initialise DAO,Repository, Viewmodel in Main Activity
         *
         * ===========================================================================================				        MVVM KOTLIN
         * ===========================================================================================
         * plugins {
         *     id 'com.android.application'
         *     id 'org.jetbrains.kotlin.android'
         *     id 'kotlin-android'
         *     id 'kotlin-kapt'
         * }
         *
         *     def room_version = "2.2.5"
         *     def kodein_version = "6.4.0"
         *     def lifecycle_version = "2.2.0"
         *     def nav_version = "2.3.1"
         *
         *     // Room and Architectural Components
         *     implementation "androidx.room:room-runtime:$room_version"
         *     implementation "androidx.room:room-ktx:$room_version"
         *     kapt "androidx.room:room-compiler:$room_version"
         *
         *     // Coroutines
         *     implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0'
         *     implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0"
         *
         *     // New Material Design
         *     implementation "com.google.android.material:material:1.0.0"
         *
         *     // ViewModel
         *     implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
         *     //Annotation Processor
         *     kapt "androidx.lifecycle:lifecycle-compiler:$lifecycle_version"
         *
         *     //LiveData
         *       implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
         *
         *     // Kodein framework used for Dependency Injection
         *     implementation "org.kodein.di:kodein-di-generic-jvm:$kodein_version"
         *     implementation "org.kodein.di:kodein-di-framework-android-x:$kodein_version"
         *
         *     //Navigation
         *      implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
         *      implementation "androidx.navigation:navigation-ui-ktx:$nav_version"
         *
         *
         *
         * *************************************************************************************
         * 		**********************************************
         *         #######    MOST IMPORTANT DEPENDENCIES/ LIBRARIES   ########
         * 		**********************************************
         *
         *
         * RETROFIT
         *
         * //Retrofit
         *     implementation 'com.squareup.retrofit2:retrofit:2.9.0'
         *     implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
         *
         * //Rxjava with Retrofit
         *
         *      implementation "com.squareup.retrofit2:adapter-rxjava3:2.9.0"
         *
         * **************************************************************************************
         *
         *  //Glide
         *     implementation 'com.github.bumptech.glide:glide:4.13.2'
         *     annotationProcessor 'com.github.bumptech.glide:compiler:4.13.2'
         *
         * **************************************************************************************
         *
         *  //Circular ImageView
         *
         *     implementation 'de.hdodenhof:circleimageview:3.1.0'
         *
         *  // Usage
         *     <de.hdodenhof.circleimageview.CircleImageView
         *     xmlns:app="http://schemas.android.com/apk/res-auto"
         *     android:id="@+id/profile_image"
         *     android:layout_width="96dp"
         *     android:layout_height="96dp"
         *     android:src="@drawable/profile"
         *     app:civ_border_width="2dp"
         *     app:civ_border_color="#FF000000"/>
         *
         * **************************************************************************************
         *
         *
         *    // AUTO IMAGE SLIDER
         *
         * https://github.com/denzcoskun/ImageSlideshow
         *
         * **************************************************************************************
         *
         *    // ANIMATION GITHUB LIBRARY
         *
         * https://github.com/daimajia/AndroidViewAnimations
         *
         * **************************************************************************************
         *
         * //VOLLEY & GSON
         *     implementation 'com.google.code.gson:gson:2.4'
         *     implementation 'com.android.volley:volley:1.2.1'
         *
         *
         * //Picasso Image Library
         *
         * 	implementation 'com.squareup.picasso:picasso:2.8'
         *
         *
         * //JAVAX
         * //@Generated annotation k liye ye dependency lagana padta hai
         * implementation 'javax.annotation:javax.annotation-api:1.3.2'
         *
         *
         * **************************************************************************************
         *
         *
         * //SWIPE REFRESH LAYOUT DEPENDENCY
         *
         * implementation "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
         *
         *
         * //Parceler
         * 	implementation 'org.parceler:parceler-api:1.1.12'
         * 	annotationProcessor 'org.parceler:parceler:1.1.12'
         *
         *
         * //Paging Library
         * 	def paging_version = "3.1.1"
         * 	implementation "androidx.paging:paging-runtime:$paging_version"
         * //Optional RxJava3 Support
         * 	implementation "androidx.paging:paging-rxjava3:$paging_version"
         *
         *
         * // Hilt Dagger
         *         implementation "com.google.dagger:hilt-android:2.4.1"
         *         annotationProcessor "com.google.dagger:hilt-compiler:2.4.1"
        * */
    }
}