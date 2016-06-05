package com.hemo.ethan.cookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main2Activity extends AppCompatActivity {

    Button mButtonInsert;
    TextView mTextViewFirebase;
    EditText mEditTextInput;
    FirebaseDatabase database;
    DatabaseReference myRef;
    String TAG = "Firebase";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mButtonInsert = (Button)findViewById(R.id.ButtonInsertText);
        mTextViewFirebase = (TextView)findViewById(R.id.TextViewFirebase);
        mEditTextInput = (EditText)findViewById(R.id.EditTextInput);

        /*database = FirebaseDatabase.getInstance();
        myRef = database.getReference("test-8aded");

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mTextViewFirebase.setText(value);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        */

    }

    public void insertText(View view) {

        myRef.setValue(mEditTextInput.getText().toString());


    }

    public void OpenIngredient(View view) {
        Intent intent = new Intent(getApplicationContext(), AddRecipeActivity.class);
        startActivity(intent);

    }
}
