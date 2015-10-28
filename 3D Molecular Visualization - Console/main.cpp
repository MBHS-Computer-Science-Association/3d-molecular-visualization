#include <iostream>
#include <vector>
#include <string>
#include <fstream>
#include <cstdlib>
#include "include/MyClass.h"
#include "include/Element.h"

using namespace std;

int search(vector<int> intVector, int value);
void sort(int array[], int length);

int main()
{
    system("color 5f");

    vector<string> lineVector;
    ifstream input("src/elements.dat");
    string line;
    while(getline(input, line))
        lineVector.push_back(line);

    vector<string>::const_iterator molecIterator;
    for (molecIterator = lineVector.begin(); molecIterator != lineVector.end(); molecIterator++) {
        cout << *molecIterator + " " << endl;
    }

    vector<int> intVector;
    for (int i = 1; i < 5; i++)
        intVector.push_back(i);
    search(intVector, 3);

    return 0;
}

// returns 1 if found, returns 0 if not found
int search(vector<int> intVector, int value)
{
    vector<int>::iterator iter;
    for (iter = intVector.begin(); iter != intVector.end(); iter++)
    {
        if (*iter == value)
        {
            return (iter - intVector.begin());
        }
    }
    return 0;
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
