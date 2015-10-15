#include <iostream>
#include <vector>
#include <string>
#include <fstream>
#include <cstdlib>
#include "include/MyClass.h"
#include "include/Element.h"

using namespace std;

int search(int array[], int length, int value);
void sort(int array[], int length);

int main()
{
    system("echo Hello World");
    system("color 5f");

    vector<string> lineVector;
    ifstream input("src/Element.cpp");
    string line;
    while(getline(input, line))
        lineVector.push_back(line);

    vector<string>::const_iterator molecIterator;
    for (molecIterator = lineVector.begin(); molecIterator != lineVector.end()) {
        cout << *molecIterator + " " << endl;
    }


    return 0;
}

int search(int array[], int length, int value)
{
    for (int i = 0; i < length; i++)
    {
        if (array[i] == value)
        {
            return i;
        }
    }
    return -1;
}

void sort(int array[], int length) {
    int i, j, tmp;
    for (i = 1; i < length; i++) {
        j = i;
        while (j > 0 && array[j - 1] > array[j]) {
            tmp = array[j];
            array[j] = array[j - 1];
            array[j - 1] = tmp;
            j--;
        }
    }
}
