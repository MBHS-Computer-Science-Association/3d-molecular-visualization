#include <iostream>

#include <string>
#include <cstdlib>
#include "include/MyClass.h"
#include "include/Element.h"

using namespace std;

int main()
{
    system("echo Hello World");
    system("color 5f");
    int value = 2;
    Element hydrogen;
    hydrogen.setAtomicNumber(1);
    cout << "The atomic number of hydrogen is: " <<
    hydrogen.getAtomicNumber() << endl;

    system("PAUSE");

    return 0;
}
