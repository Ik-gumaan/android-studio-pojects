package com.myandroidapp.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myandroidapp.children_learning_app.shapeFragments.ShapeCircleFragment;
import com.myandroidapp.children_learning_app.shapeFragments.ShapeDiamondFragment;
import com.myandroidapp.children_learning_app.shapeFragments.ShapeHexagonFragment;
import com.myandroidapp.children_learning_app.shapeFragments.ShapePentagonFragment;
import com.myandroidapp.children_learning_app.shapeFragments.ShapeRectangleFragment;
import com.myandroidapp.children_learning_app.shapeFragments.ShapeSquareFragment;
import com.myandroidapp.children_learning_app.shapeFragments.ShapeStarFragment;
import com.myandroidapp.children_learning_app.shapeFragments.ShapeTrapeziumFragment;
import com.myandroidapp.children_learning_app.shapeFragments.ShapeTriangleFragment;

public class ShapesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        Button circle=findViewById(R.id.btn_cirle);
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.shapeFragmentContainerView, ShapeCircleFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button square=findViewById(R.id.btn_square);
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.shapeFragmentContainerView, ShapeSquareFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button triangle=findViewById(R.id.btn_triangle);
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.shapeFragmentContainerView, ShapeTriangleFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button rectangle=findViewById(R.id.btn_rectangle);
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.shapeFragmentContainerView, ShapeRectangleFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button diamond=findViewById(R.id.btn_diamond);
        diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.shapeFragmentContainerView, ShapeDiamondFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button star=findViewById(R.id.btn_star);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.shapeFragmentContainerView, ShapeStarFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button trapezium=findViewById(R.id.btn_trapezium);
        trapezium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.shapeFragmentContainerView, ShapeTrapeziumFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button pentagon=findViewById(R.id.btn_pentagon);
        pentagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.shapeFragmentContainerView, ShapePentagonFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        Button hexagon=findViewById(R.id.btn_hexagon);
        hexagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.shapeFragmentContainerView, ShapeHexagonFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });


    }
}