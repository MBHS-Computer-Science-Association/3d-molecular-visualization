#include <iostream>

#include <string>
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

    int array[5] = {2, 5, 3, 1, 4};
    cout << search(array, 5, 3);
    sort(array, 5);
    cout << endl << endl;
    for (int i = 0; i < 5; i++)
    {
        cout << (int)array[i] << " ";
    }
    cout << endl << endl;
    cout << array[3];


    //int value = 2;
    //Element hydrogen;
    //hydrogen.setAtomicNumber(1);
    //cout << "The atomic number of hydrogen is: " <<
    //hydrogen.getAtomicNumber() << endl;

    //system("PAUSE");
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
