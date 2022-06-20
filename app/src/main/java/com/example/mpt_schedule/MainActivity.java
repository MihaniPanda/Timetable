package com.example.mpt_schedule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Schedule> schedules = new ArrayList<>();
    RecyclerView recyclerView;
    StateAdapter adapter;
    Button btn;
    boolean ch = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);
        setDataCh();

        recyclerView = findViewById(R.id.list);
        adapter = new StateAdapter(this, schedules);
        recyclerView.setAdapter(adapter);

        btn.setOnClickListener(v -> {

            if(ch){
                setDataCh();
                btn.setText("Числитель");
            }else{
                setDataZn();
                btn.setText("Знаменатель");
            }
            ch = !ch;
            adapter.notifyDataSetChanged();
        });

    }

    private void setDataCh(){
        schedules.clear();
        schedules.add(new Schedule("Нахимовский", "Понедельник",
                new String[]{
                        "","Системное програмирование\nО.В. Копылов",
                        "Разработка программных модулей\nА.А. Шимбирёв",
                        "Разработка мобильных приложений\nА.О. Лястников",
                        "Физическая культура | А.В. Андрюков"}));
        schedules.add(new Schedule("-", "Вторник",
                new String[]{
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА"}));
        schedules.add(new Schedule("-", "Среда",
                new String[]{
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА"}));
        schedules.add(new Schedule("Неженская", "Четверг",
                new String[]{
                        "Инструментальные средства разработки \nПО | Ю.В. Севастьянов",
                        "Технология разработки программного \nобеспечения | Л.А. Соколова",
                        "Иностарнный язык в \nпрофессиональной деятельности | А.Д. Завьялова, А.Ю. Дымская",
                        "Техонология разработки и защиты \nбаз дынных | Г.Ю. Волкова"}));

        schedules.add(new Schedule("Нахимовский", "Пятница",
                new String[]{
                        "", "Системное программирование\nО.В. Копылов",
                        "Разработка программных модулей\nА.Ю. Бушин",
                        "Технология разработки программного \nобеспечения | Л.А. Соколова",
                        "Разработка мобильных приложений\nА.О. Лястников"}));

    }
    private void setDataZn(){
        schedules.clear();
        schedules.add(new Schedule("Нахимовский", "Понедельник",
                new String[]{
                        "","Техонология разработки и защиты \nбаз дынных | Г.Ю. Волкова",
                        "Разработка программных модулей\nА.А. Шимбирёв",
                        "Разработка программных модулей\nА.Ю. Бушин",
                        "Физическая культура | А.В. Андрюков"}));
        schedules.add(new Schedule("-", "Вторник",
                new String[]{
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА"}));
        schedules.add(new Schedule("-", "Среда",
                new String[]{
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА",
                        "ПРАКТИКА"}));
        schedules.add(new Schedule("Неженская", "Четверг",
                new String[]{
                        "Инструментальные средства разработки \nПО | Ю.В. Севастьянов",
                        "Технология разработки программного \nобеспечения | Л.А. Соколова",
                        "Иностарнный язык в \nпрофессиональной деятельности | А.Д. Завьялова, А.Ю. Дымская",
                        "Техонология разработки и защиты \nбаз дынных | Г.Ю. Волкова"}));

        schedules.add(new Schedule("Нахимовский", "Пятница",
                new String[]{
                        "", "Системное программирование\nО.В. Копылов",
                        "Разработка программных модулей\nА.Ю. Бушин",
                        "Инструментальные средства разработки \nПО | Ю.В. Севастьянов",
                        "Разработка мобильных приложений\nА.О. Лястников"}));
    }
}