package com.hemo.ethan.cookbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.vision.text.Text;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddRecipeActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);


    }

    @Override
    protected void onStart() {
        super.onStart();
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("test-8aded/Recipes");
    }

    public void sendIngredient(View view) {

        TextView textViewDisplay = (TextView)findViewById(R.id.TextViewDisplay);
        EditText etAmount = (EditText)findViewById(R.id.EditTextAmount);
        EditText etName = (EditText)findViewById(R.id.EditTextName);
        float amount = Float.parseFloat(etAmount.getText().toString());
        String name = etName.getText().toString();

        MeasurementType type = new MeasurementType("Spoon");
        Ingredient ingredient = new Ingredient(amount,name,type);
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(ingredient);

        Recipe recipe = new Recipe(ingredients);

        Toast.makeText(AddRecipeActivity.this, recipe.Test(), Toast.LENGTH_SHORT).show();
        textViewDisplay.setText(recipe.toString());


        String key = myRef.push().getKey();
        DatabaseReference myNewRef = database.getReference("test-8aded/Recipes/"+key);
        myNewRef.setValue(recipe);


    }
}
