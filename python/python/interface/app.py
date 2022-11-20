class Base:
    def method1(self, name: str) -> str:
        pass

    def method2(self, name: str) -> int:
        pass


class Derived1(Base):
    def method1(self, name: str) -> str:
        return "Hello " + name

    def method2(self, name: str) -> int:
        return len(name)


class Derived2(Base):
    def method1(self, name: str) -> str:
        return "Hello " + name

    def method3(self, name: str) -> int:
        return len(name)

# print(issubclass(Derived1, Base))
# print(issubclass(Derived2, Base))
# print(issubclass(Derived1, Derived2))


class BaseMeta(type):
    def __instancecheck__(cls, instance):
        return cls.__subclasscheck__(type(instance))

    def __subclasscheck__(cls, subclass):
        return (hasattr(subclass, 'method1') and
                callable(subclass.method1) and
                hasattr(subclass, 'method2') and
                callable(subclass.method2)
                )


class UpdatedBase(metaclass=BaseMeta):
    def method1(self, name: str):
        return "Hello" + name

    def method2(self, name: str):
        return len(name)


class UpdatedDerived1(UpdatedBase):
    def method1(self, name: str) -> str:
        return "Hello" + name

    def method2(self, name: str) -> int:
        return len(name)


class UpdatedDerived2(UpdatedBase):
    def method1(self, name: str) -> str:
        return "Hello" + name

    def method3(self, name: str) -> int:
        return len(name)


print(issubclass(UpdatedDerived1, UpdatedBase))
print(issubclass(UpdatedDerived2, UpdatedBase))
