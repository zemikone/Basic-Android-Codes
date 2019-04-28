//https://github.com/Clans/FloatingActionButton

//Add a dependency to your build.gradle:

dependencies {
    compile 'com.github.clans:fab:1.6.4'
}

//Add this to the beginning of your xml:

xmlns:fab="http://schemas.android.com/apk/res-auto"

//Now just add your buttons, example:

<com.github.clans.fab.FloatingActionMenu
    android:id="@+id/floatingMenu"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_alignParentBottom="true"
    android:layout_alignParentRight="true"
    fab:menu_labels_ellipsize="end"
    fab:menu_labels_singleLine="true"
    fab:menu_fab_label="Cancel"
    fab:menu_backgroundColor="#ccffffff"
    fab:menu_animationDelayPerItem="0"
    fab:menu_colorNormal="#00C29F"
    fab:menu_colorPressed="#00C29F"
    fab:menu_colorRipple="#00C29F"
    android:padding="8dp">

    <com.github.clans.fab.FloatingActionButton
        android:id="@+id/fabEdit"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/ic_edit_white"
        fab:fab_size="mini"
        fab:fab_label="Edit Category"/>

    <com.github.clans.fab.FloatingActionButton
        android:id="@+id/fabAddProduct"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/fab_add"
        fab:fab_size="mini"
        fab:fab_label="Add product"/>

    <com.github.clans.fab.FloatingActionButton
        android:id="@+id/fabAddSubcategory"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/fab_add"
        fab:fab_size="mini"
        fab:fab_label="Subcategory"/>

</com.github.clans.fab.FloatingActionMenu>
