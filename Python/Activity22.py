import pytest

def test_first_method():
    assert True

def test_second_method():
    assert True

@pytest.mark.activity
def test_third_method_activity():
    assert True

@pytest.mark.activity
def test_fourth_method_activity():
    assert True
