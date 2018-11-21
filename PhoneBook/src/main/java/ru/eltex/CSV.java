package ru.eltex;
import java.io.*;
public interface CSV{
  void toCSV(FileWriter fw);
  void fromCSV(String filename);
}
