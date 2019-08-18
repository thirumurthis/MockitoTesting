# MockitoTesting
Learning Mockito TestFramework

#### ArgumentMatcher

#### Method call verfiy

#### Exception catch using (expect)


### using annotation:
  @Mock annotation gets enabled only when using the MokcitoJunitRunner at the class level.
  
  ```
  @RunWith(org.mockito.junit.MockitoJUnitRunner.class)
  ````
  Alternarively, we can also use
  
  ```
  @Before
public void init() {
    MockitoAnnotations.initMocks(this);
}
```
```
@BeforeEach
public void init() {
    MockitoAnnotations.initMocks(this);
}
```
##### verifyZeroInteraction(mockclass)


#### PowerMock, first verifies and then invokes the method, used for static method, private method invocation

#### Mockito - how to test void method.
  using the ```dothrow () ```

#### doAnswer ()

##### doNothing () - used for void method for sequence of verification

##### doCallRealMethod ()


