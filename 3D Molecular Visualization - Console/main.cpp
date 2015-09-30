#include <iostream>
#include <string>

using namespace std;

class Element
{
public:
    int atomicNumber;
    int getAtomicNumber()
    {
        return atomicNumber;
    }

    void setAtomicNumber(int value)
    {
        atomicNumber = value;
    }
};

class Reaction
{
public:
    string type;
    void setRxnType(string rxn)
    {
        type = rxn;
    }
    string getRxnType()
    {
        return type;
    }

};

int main()
{
    Element hydrogen;
    hydrogen.setAtomicNumber(1);
    cout << "The atomic number of hydrogen is: " <<
    hydrogen.getAtomicNumber() << endl;

    Reaction rxn;
    rxn.setRxnType("Redox");
    cout << rxn.getRxnType();

    cin.clear(); // reset any error flags
    cin.ignore(32767, '\n'); // ignore any characters in the input buffer until we find an enter character
    cin.get(); // get one more char from the user

    return 0;
}
