#ifndef ELEMENT_H
#define ELEMENT_H


class Element
{
    public:
        Element();
        Element(int value);
        int getAtomicNumber();
        void setAtomicNumber(int value);
    protected:
    private:
        int atomicNumber;
};

#endif // ELEMENT_H
