package view;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SearchBook extends JPanel {

    public SearchBook() {
        
        // 테이블 생성
        JTable bookTable = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("제어번호");
        model.addColumn("제목");
        model.addColumn("저자");
        model.addColumn("발행처");
        model.addColumn("발행년도");
        bookTable.setModel(model);
        
        try {
            // 파일에서 데이터 읽기
        	String filePath = System.getProperty("user.dir") + "/src/resources/Book_List.csv";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // JScrollPane 생성
        JScrollPane scrollPane = new JScrollPane(bookTable);
        
        // SearchBook 패널에 BorderLayout으로 추가
        add(scrollPane, BorderLayout.CENTER);
        
    }
}